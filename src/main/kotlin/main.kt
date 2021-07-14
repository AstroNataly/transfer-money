package ru.netology

fun main() {
    val transferAmount = 80_000_000
    val minCommissionAmount = 3_500
    val commissionalProcent: Double = 0.75
    val commissionAmount = transferAmount * commissionalProcent / 100


    val totalCommissionAmount: Int = if (transferAmount >= (100 * transferAmount/commissionalProcent))
        commissionAmount.toInt() else minCommissionAmount
    println("Сумма комиссии за перевод $totalCommissionAmount равна $totalCommissionAmount")
}