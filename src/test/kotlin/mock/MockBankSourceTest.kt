package mock

import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Test


internal class MockBankSourceTest {

    private val mockDataSource  = MockBankSource()

    @Test
  fun `should provide a collection of banks`() {

      val banks = mockDataSource.retrieveBanks()
        assertThat(banks.size).isGreaterThanOrEqualTo(3)

  }
    @Test
    fun `should provide some mock data`() {
            // given
            val banks = mockDataSource.retrieveBanks()
            //when
            assertThat(banks).allMatch {it.accountNumber.isNotBlank() }
            assertThat(banks).anyMatch {it.trust !=0.0 }
            assertThat(banks).anyMatch {it.transactionFee != 0 }
            //then

    }

}

