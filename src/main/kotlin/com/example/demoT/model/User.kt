package com.example.demoT.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
data class User(
    @Id val id: String? = null,
    val razonSocial: String? = null,
    val regimenFiscal: String? = null,
    val rfc: String? = null,
    val correoElectronico: String? = null,
    val cp: String? = null,
    val estado: String? = null,
    val colonia: String? = null,
    val calle: String? = null,
    val nombreEmpresa: String? = null,
    val telefono: String? = null,
    val banco: String? = null,
    val cuentaBancaria: String? = null,
    val claveInterbancaria: String? = null
)

