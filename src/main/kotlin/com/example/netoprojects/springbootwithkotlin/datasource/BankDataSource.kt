package com.example.netoprojects.springbootwithkotlin.datasource

import com.example.netoprojects.springbootwithkotlin.model.Bank

interface BankDataSource {

    fun retrieveBanks() : Collection<Bank>
}