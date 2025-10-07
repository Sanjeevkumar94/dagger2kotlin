package com.example.flow.ManualDependency

import android.util.Log

interface AnalyticsService {
    fun trackEvent(eventName:String,eventType:String)
}

class MixPanel:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("didata","Max panel - $eventName - $eventType")
    }
}

class FirebseAnalytics:AnalyticsService{
    override fun trackEvent(eventName: String, eventType: String) {
        Log.d("didata","FirebseAnalytics - $eventName - $eventType")
    }
}