package com.example.confuser

import com.example.confuser.action.PaintRed
import javax.inject.Inject

class DoRandomActionsService {

    @Inject
    lateinit var paintRed: PaintRed

    fun nextAction(): Boolean {
        paintRed.paint()
        return false
    }

}