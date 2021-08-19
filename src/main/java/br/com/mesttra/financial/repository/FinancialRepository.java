package br.com.mesttra.financial.repository;

import br.com.mesttra.financial.entity.MonthlyExpense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialRepository extends JpaRepository<MonthlyExpense, Long> {
}
