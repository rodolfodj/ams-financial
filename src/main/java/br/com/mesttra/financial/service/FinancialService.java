package br.com.mesttra.financial.service;

import br.com.mesttra.financial.dto.PlayerDto;
import br.com.mesttra.financial.entity.MonthlyExpense;
import br.com.mesttra.financial.enums.ExpenseType;
import br.com.mesttra.financial.repository.FinancialRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
@AllArgsConstructor
public class FinancialService {

    private final FinancialRepository repository;

    public MonthlyExpense addNewPlayer(PlayerDto dto) {

        MonthlyExpense expense = MonthlyExpense.builder()
                .amount(dto.getSalary())
                .dueDate(LocalDate.now())
                .expenseType(ExpenseType.SALARY)
                .build();

        return repository.save(expense);
    }

}
