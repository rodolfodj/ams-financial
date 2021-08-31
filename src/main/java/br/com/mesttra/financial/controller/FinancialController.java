package br.com.mesttra.financial.controller;


import br.com.mesttra.financial.dto.PlayerDto;
import br.com.mesttra.financial.entity.MonthlyExpense;
import br.com.mesttra.financial.service.FinancialService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@AllArgsConstructor
@Api(value = "Financial", tags = {"Financial"})
public class FinancialController {

    private final FinancialService service;

    @PostMapping("/hiring")
    @ResponseStatus(HttpStatus.OK)
    @ApiOperation(value = "Contratar jogador",
            notes = "This method hire a new player")
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "Expense added"),
            @ApiResponse(code = 500, message = "Internal Error"),
    })
    public MonthlyExpense hireNewPlayer(@RequestBody PlayerDto body) {
        return service.addNewPlayer(body);
    }

}
