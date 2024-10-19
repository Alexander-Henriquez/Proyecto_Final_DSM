package org.example.project.data

import org.example.project.model.Expense
import org.example.project.model.ExpenseCategory

object ExpenseManager{
 private var currentId = 1L

 val fakeExpenseList = mutableListOf(
     Expense(
         id = currentId++,
         amount = 0.0,
         category = ExpenseCategory.GROCERIES,
         description = "Weekly buy"
     ),
     Expense(
         id = currentId++,
         amount = 0.0,
         category = ExpenseCategory.SNACKS,
         description = "Diana"
     ),
     Expense(
         id = currentId++,
         amount = 0.0,
         category = ExpenseCategory.CAR,
         description = "Porsche"
     ),
     Expense(
         id = currentId++,
         amount = 0.0,
         category = ExpenseCategory.PARTY,
         description = "fin de semana"
     ),
     Expense(
         id = currentId++,
         amount = 0.0,
         category = ExpenseCategory.HOUSE,
         description = "Limpiar"
     ),
     Expense(
         id = currentId++,
         amount = 0.0,
         category = ExpenseCategory.OTHER,
         description = "Servicios"
     )
 )
    fun addNewExpense(expense: Expense){
        fakeExpenseList.add(expense.copy(id = currentId++))
    }

    fun editExpense(expense: Expense){
        val index = fakeExpenseList.indexOfFirst {
            it.id == expense.id
        }
        if (index != -1){
            fakeExpenseList[index] = fakeExpenseList[index].copy(
                amount = expense.amount,
                category = expense.category,
                description = expense.description

            )
        }
    }

    fun getCategories(): List<ExpenseCategory>{
        return listOf(
            ExpenseCategory.GROCERIES,
            ExpenseCategory.SNACKS,
            ExpenseCategory.COFFE,
            ExpenseCategory.CAR,
            ExpenseCategory.HOUSE,
            ExpenseCategory.OTHER,
            ExpenseCategory.PARTY
        )
    }

}