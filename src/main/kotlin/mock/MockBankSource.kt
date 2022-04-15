package mock

import datasource.BankDataSource
import org.springframework.stereotype.Repository
import zatec.bankmanagementsystem.model.Bank

@Repository
class MockBankSource: BankDataSource {
    val banks = listOf(
        Bank("123 ",3.14, 17),
        Bank("1010",17.4, 0),
        Bank("5674",0.0, 100)
    )

    override fun retrieveBanks(): Collection<Bank> = banks

}