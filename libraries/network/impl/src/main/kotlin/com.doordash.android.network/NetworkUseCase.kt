package com.doordash.android.network

import java.util.UUID
import javax.inject.Inject

class Network @Inject constructor(

) : NetworkUseCase {
    override fun networkId(): String {
        return UUID.randomUUID().toString()
    }
}
