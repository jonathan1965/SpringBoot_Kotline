package datasource

import zatec.bankmanagementsystem.model.Bank

interface BankDataSource {

    fun getBank(): Collection<Bank>
}