package zatec.bankmanagementsystem.datasource

import zatec.bankmanagementsystem.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
    abstract fun retrieveBank(accountNumber: String): Bank

}