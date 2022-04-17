package zatec.bankmanagementsystem.service

import zatec.bankmanagementsystem.datasource.BankDataSource
import org.springframework.stereotype.Service
import zatec.bankmanagementsystem.model.Bank


@Service
class BankService(private val datasource: BankDataSource) {

     fun getBanks(): Collection<Bank> = datasource.retrieveBanks()
    fun getBank(accountNumber: String): Bank = datasource.retrieveBank(accountNumber)
}