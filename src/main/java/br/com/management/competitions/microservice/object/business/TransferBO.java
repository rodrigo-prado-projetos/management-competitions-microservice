package br.com.management.competitions.microservice.object.business;

import br.com.management.competitions.microservice.controller.vo.TransferVO;
import br.com.management.competitions.microservice.object.service.TransferBS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferBO {
    @Autowired
    private TransferBS transferBS;

    public void deleteTransfer(Integer id) {
    }

    public void updateTransfer(TransferVO transferVO) {
    }

    public void createTransfer(TransferVO transferVO) {
    }
}
