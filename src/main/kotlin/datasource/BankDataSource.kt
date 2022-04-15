package datasource

import zatec.bankmanagementsystem.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>

}