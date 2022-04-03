package mock

import datasource.BankDataSource
import org.springframework.stereotype.Repository
import zatec.bankmanagementsystem.model.Bank

@Repository
class MockBankSource: BankDataSource {
    val banks = listOf(
        Bank(accountNumber = "1234", trust = 3.14, transactionFee = 17),
        Bank(accountNumber = "1234", trust = 17.0, transactionFee = 0),
        Bank(accountNumber = "5678", trust = 0.0, transactionFee = 100)
    )
    override fun retrieveBanks(): Collection<Bank> =  banks

}