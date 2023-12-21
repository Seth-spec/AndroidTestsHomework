package com.example.retrofit.presenter.view_model

import junit.framework.TestCase.assertEquals
import org.junit.Assert.assertNotEquals
import org.junit.Before
import org.junit.Test


class ViewModelForTestingTest {

    private lateinit var viewModel: ViewModelForTesting

    @Before
    fun setUp() {
        viewModel = ViewModelForTesting()
    }

    @Test
    fun `test if number value set correctly`() {
        val number = "123"

        val result = viewModel.enterNumber(number)

        assertEquals("123", result)
    }

    @Test
    fun `test if number value is incorrect`() {
        val number = "123"
        val result = viewModel.enterNumber(number)
        assertNotEquals("124", result)
    }
    @Test
    fun `test enter negative number`() {
        val result = viewModel.enterNumber("-3")
        assertEquals("-3", result)
    }

    @Test
    fun `test if value clean correctly`() {
        val result = viewModel.enterNumber("1234")
        assertNotEquals("1234", result)

        assertEquals("", viewModel.clear())
    }
    @Test
    fun `test clear when already empty`() {
        val result = viewModel.clear()
        assertEquals("", result)
    }

    @Test
    fun `test multiply operation with positive number`() {
        viewModel.enterNumber("2")

        val result = viewModel.multiplyOperation()

        assertEquals(4, result)
    }
    @Test
    fun `test if multiply operation is incorrect`() {
        viewModel.enterNumber("2")

        val result = viewModel.multiplyOperation()

        assertNotEquals(5, result)
    }


    @Test
    fun `test multiply operation with negative number`() {
        viewModel.enterNumber("-2")

        val result = viewModel.multiplyOperation()

        assertEquals(-4, result)
    }

    @Test
    fun `test multiply operation with zero`() {
        viewModel.enterNumber("0")

        val result = viewModel.multiplyOperation()

        assertEquals(0, result)
    }

    //anu es pirvelad ro vcade test failed damiwera. amitom gadavakete funqcia.
    @Test
    fun `test multiply operation with empty string`() {
        val result = viewModel.multiplyOperation()

        assertEquals(0, result)
    }
    @Test
    fun `test multiply after clearing`() {
        viewModel.enterNumber("2")
        viewModel.clear()
        val result = viewModel.multiplyOperation()
        assertEquals(0, result)
    }

}
