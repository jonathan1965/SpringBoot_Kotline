package zatec.bankmanagementsystem.Controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import zatec.bankmanagementsystem.model.Bank
import zatec.bankmanagementsystem.service.BankService


@RestController
@RequestMapping("api/banks")
class BankController (private val service: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()

    @GetMapping("/{accountNumber}")
    fun getBank (@PathVariable accountNumber: String):Bank = service.getBank(accountNumber)
}