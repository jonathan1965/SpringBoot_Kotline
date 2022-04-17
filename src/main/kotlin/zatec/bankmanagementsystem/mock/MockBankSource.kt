package zatec.bankmanagementsystem.mock

import zatec.bankmanagementsystem.datasource.BankDataSource
import org.springframework.stereotype.Repository
import zatec.bankmanagementsystem.model.Bank

@Repository
class MockBankSource: BankDataSource {
    val banks = listOf(
        Bank("1234",3.14, 17),
        Bank("1010",17.4, 0),
        Bank("5674",0.0, 100)
    )

    override fun retrieveBank(accountNumber: String): Bank =
         banks.first {it.accountNumber == accountNumber}


    override fun retrieveBanks(): Collection<Bank> = banks

}