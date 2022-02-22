package br.com.management.competitions.microservice.controller;

import br.com.management.competitions.microservice.controller.dto.TransferDTO;
import br.com.management.competitions.microservice.controller.vo.TransferVO;
import br.com.management.competitions.microservice.object.business.TransferBO;
import br.com.management.competitions.microservice.util.ConstantsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/competitions")
public class TransferController {
    @Autowired
    private TransferBO transferBO;

    @GetMapping("/v1/transfers")
    public ResponseEntity<TransferDTO> findAllTransfers() {
        return ResponseEntity.ok(new TransferDTO());
    }

    @PostMapping("v1/transfers")
    public ResponseEntity<Object> createTransfer(@RequestBody TransferVO transferVO) {
        this.transferBO.createTransfer(transferVO);
        return ResponseEntity.ok(ConstantsUtil.CREATE_SUCCESS);
    }

    @PutMapping("v1/transfers")
    public ResponseEntity<Object> updateTransfer(@RequestBody TransferVO transferVO) {
        this.transferBO.updateTransfer(transferVO);
        return ResponseEntity.ok(ConstantsUtil.UPDATE_SUCCESS);
    }

    @DeleteMapping("v1/transfers/{id}")
    public ResponseEntity<Object> deleteTransfer(@PathVariable(name = "id") Integer id) {
        this.transferBO.deleteTransfer(id);
        return ResponseEntity.ok(ConstantsUtil.DELETE_SUCCESS);
    }
}