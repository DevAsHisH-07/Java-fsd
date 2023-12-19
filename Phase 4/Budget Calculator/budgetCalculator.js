let deals = [];
let annualBudget = 0;

function addDeal() {
  const dealName = document.getElementById('dealName').value;
  const expense = parseFloat(document.getElementById('expense').value);

  if (!dealName || isNaN(expense) || expense <= 0) {
    alert('Please enter valid deal details.');
    return;
  }

  
  deals.push({ dealName, expense });

  
  updateDealsTable();
  updateBudget();

  
  document.getElementById('dealForm').reset();
}

function deleteDeal(index) {
  
  deals.splice(index, 1);

  
  updateDealsTable();
  updateBudget();
}

function updateDealsTable() {
  const tableBody = document.getElementById('dealTableBody');
  tableBody.innerHTML = '';

  deals.forEach((deal, index) => {
    const row = tableBody.insertRow();
    const cell1 = row.insertCell(0);
    const cell2 = row.insertCell(1);
    const cell3 = row.insertCell(2);

    cell1.textContent = deal.dealName;
    cell2.textContent = `$${deal.expense.toFixed(2)}`;

    
    const deleteButton = document.createElement('button');
    deleteButton.textContent = 'Delete';
    deleteButton.className = 'btn btn-danger btn-sm';
    deleteButton.onclick = () => deleteDeal(index);
    
    cell3.appendChild(deleteButton);
  });
}

function updateBudget() {
  annualBudget = deals.reduce((total, deal) => total + deal.expense, 0);
  const budgetDisplay = document.getElementById('annualBudget');
  budgetDisplay.textContent = `Total Budget: $${annualBudget.toFixed(2)}`;
}
