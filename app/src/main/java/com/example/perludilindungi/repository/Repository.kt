package com.example.perludilindungi.repository

import com.example.perludilindungi.api.RetrofitInstance
import com.example.perludilindungi.models.FaskesResponse
import com.example.perludilindungi.models.NewsResponse
import com.example.perludilindungi.models.ProvinceCityResponse
import retrofit2.Response

class Repository {

    suspend fun getProvince(): Response<ProvinceCityResponse> {
        return RetrofitInstance.api.getProvince()
    }

    suspend fun getCity(provinceName: String): Response<ProvinceCityResponse> {
        return RetrofitInstance.api.getCity(provinceName)
    }

    suspend fun getFaskes(province: String, city: String): Response<FaskesResponse> {
        return RetrofitInstance.api.getFaskes(province, city)
    }

    suspend fun getNews(): Response<NewsResponse> {
        return  RetrofitInstance.api.getNews()
    }

}