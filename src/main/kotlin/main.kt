package ru.netology

fun main() {
    val transferAmount = 80_000_000
    val minCommissionAmount = 3_500
    val commissionalProcent = 0.75
    val commissionAmount = transferAmount * commissionalProcent / 100

    val totalCommissionAmount = if (transferAmount >= (100 * transferAmount/commissionalProcent)) commissionAmount else minCommissionAmount
    println("Сумма комиссии за перевод $totalCommissionAmount коп. равна $totalCommissionAmount коп.")
}