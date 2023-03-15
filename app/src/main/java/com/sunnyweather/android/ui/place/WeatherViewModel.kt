package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.Repository
import com.sunnyweather.android.logic.model.MyLocation

class WeatherViewModel: ViewModel(){
    private val locationLiveData=MutableLiveData<MyLocation>()
    var locationLng=""
    var locationLat=""
    var placeName=""
    val weatherLiveData=Transformations.switchMap(locationLiveData){location->
        Repository.refreshWeater(location.lng,location.lat)
    }
    fun refreshWeater(lng:String,lat:String){
        locationLiveData.value= MyLocation(lng,lat)
    }
}