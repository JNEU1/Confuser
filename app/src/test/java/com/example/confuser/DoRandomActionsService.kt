package com.example.confuser

import com.example.confuser.action.PaintRed
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DoRandomActionsServiceTest {

    @Mock
    lateinit var paintRed: PaintRed

    @InjectMocks
    lateinit var testee: DoRandomActionsService

    @Test
    fun testMockito() {
        `when`(paintRed.paint()).thenCallRealMethod()
        var result = testee.nextAction();
        assert(!result)
        verify(paintRed).paint()
        verifyNoMoreInteractions(paintRed)
    }
}