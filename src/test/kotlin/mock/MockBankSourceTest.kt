package mock

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test


internal class MockBankSourceTest {

    private val mockDataSource  = MockBankSource()

    @Test
  fun `should provide a collection of banks`() {
          // given

          //when
      val banks = mockDataSource.getBank()

          //then
        Assertions.assertThat(banks.size).isGreaterThanOrEqualTo(3)

  }
    @Test
    fun `should provide some mock data`() {
            // given
            
            val banks = mockDataSource.getBank()
            //when
            
            //then
            Assertions.assertThat(banks).allMatch {it.accountNumber.isNotBlank()}
            Assertions.assertThat(banks).anyMatch {it.trust != 0.0 }
            Assertions.assertThat(banks).anyMatch {it.transactionFee != 0}
    }
}