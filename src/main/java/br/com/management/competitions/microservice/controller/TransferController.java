package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.dto.TransferDTO;
import br.com.management.competitions.microservice.controller.vo.TransferVO;
import br.com.management.competitions.microservice.object.business.TransferBO;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/competitions")
public class TransferController {
    @Autowired
    private TransferBO transferBO;

    @GetMapping("/v1/transfers")
    public ResponseEntity<List<TransferDTO>> findAllTransfers() {
        List<TransferDTO> transfers = this.transferBO.findAllTransfers();

        if (transfers.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(transfers);
    }

    @PostMapping("v1/transfers")
    public ResponseEntity<Object> createTransfer(@RequestBody TransferVO transferVO) {
        this.transferBO.createTransfer(transferVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }
}