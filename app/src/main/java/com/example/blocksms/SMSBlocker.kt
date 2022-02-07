package com.example.blocksms

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.provider.Telephony.Sms.Intents.SMS_RECEIVED_ACTION
import android.telephony.SmsMessage
import android.util.Log
import android.widget.Toast


class SMSBlocker:BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent) {
        Log.e("receive", "onReceive")
        val action = intent!!.action
        if(action.equals(SMS_RECEIVED_ACTION)) {
            val bundle = intent.extras
            if(bundle != null){
                var pdus = bundle!!.get("pdus") as Array<Any>
                for (pdu in pdus) {
                    val smsMessage: SmsMessage = SmsMessage.createFromPdu(pdu as ByteArray)
                    val address: String = smsMessage.originatingAddress!!
                    val body: String = smsMessage.getMessageBody()
                    abortBroadcast()
                    Log.e("textmessage", "$address $body")
                }
            }
            abortBroadcast()
        }
        abortBroadcast()
    }

}