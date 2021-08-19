package br.com.mesttra.financial.controller;


import br.com.mesttra.financial.dto.PlayerDto;
import br.com.mesttra.financial.entity.MonthlyExpense;
import br.com.mesttra.financial.service.FinancialService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class FinancialController {

    private final FinancialService service;

    @PostMapping("/hiring")
    public MonthlyExpense hireNewPlayer(@RequestBody PlayerDto body) {
        return service.addNewPlayer(body);
    }

}
