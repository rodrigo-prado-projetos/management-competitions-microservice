package br.com.management.competitions.microservice.object.service;

import br.com.management.competitions.microservice.controller.dto.TransferDTO;
import br.com.management.competitions.microservice.controller.vo.TransferVO;
import br.com.management.competitions.microservice.repositories.PlayerRepository;
import br.com.management.competitions.microservice.repositories.TeamRepository;
import br.com.management.competitions.microservice.repositories.TransferRepository;
import br.com.management.competitions.microservice.repositories.model.Player;
import br.com.management.competitions.microservice.repositories.model.Team;
import br.com.management.competitions.microservice.repositories.model.Transfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TransferBS {
    @Autowired
    private TransferRepository transferRepository;
    @Autowired
    private PlayerRepository playerRepository;
    @Autowired
    private TeamRepository teamRepository;

    public void createTransfer(TransferVO transferVO) {
        Player byIdTeam = this.playerRepository.findByIdTeam(transferVO.getOriginTeam());

        if (Objects.isNull(byIdTeam)) {
            throw new RuntimeException("Jogador não pertence ao time informado: ".concat(String.valueOf(transferVO.getOriginTeam())));
        }

        Optional<Team> byId = this.teamRepository.findById(transferVO.getDestinationTeam());

        if (!byId.isPresent()) {
            throw new RuntimeException("Time não encontrado para o id destino informado: ".concat(String.valueOf(transferVO.getOriginTeam())));
        }
        byIdTeam.setIdTeam(transferVO.getDestinationTeam());
        this.playerRepository.save(byIdTeam);

        Transfer transfer = getTransfer(transferVO);
        this.transferRepository.save(transfer);

    }

    private Transfer getTransfer(TransferVO transferVO) {
        Transfer transfer = new Transfer();
        transfer.setDate(transferVO.getData());
        transfer.setDestinationTeam(transferVO.getDestinationTeam());
        transfer.setOriginTeam(transferVO.getOriginTeam());
        transfer.setIdPlayer(transferVO.getIdPlayer());
        transfer.setValue(transferVO.getValor());
        return transfer;
    }

    public  List<TransferDTO> findAllTransfers() {
        List<TransferDTO> transferDTOList = new ArrayList<>();
        Iterable<Transfer> transfers = this.transferRepository.findAll();

        transfers.forEach(transfer -> {
            TransferDTO transferDTO = new TransferDTO();
            transferDTO.setIdTransfer(transfer.getId());
            transferDTO.setDestinationTeam(transfer.getDestinationTeam());
            transferDTO.setOriginTeam(transfer.getOriginTeam());
            transferDTO.setValor(transfer.getValue());
            transferDTO.setData(transfer.getDate());
            transferDTO.setIdPlayer(transfer.getIdPlayer());
            transferDTOList.add(transferDTO);
        });

        return transferDTOList;

    }
}
