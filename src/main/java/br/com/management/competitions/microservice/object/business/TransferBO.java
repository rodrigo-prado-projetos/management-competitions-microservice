package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.dto.TransferDTO;
import br.com.management.competitions.microservice.controller.vo.TransferVO;
import br.com.management.competitions.microservice.object.service.TransferBS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransferBO {
    @Autowired
    private TransferBS transferBS;

    public void createTransfer(TransferVO transferVO) {
        this.transferBS.createTransfer(transferVO);
    }

    public List<TransferDTO> findAllTransfers() {
        return this.transferBS.findAllTransfers();
    }
}
