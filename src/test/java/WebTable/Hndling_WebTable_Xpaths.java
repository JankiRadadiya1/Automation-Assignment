package WebTable;

public class Hndling_WebTable_Xpaths {

/*	table - it represents the complete WebTable
	thead - represents the name of the columns in the header
	tbody - represents all the rows and cols of this webtable
	tfoot - represents everything written at the footer of the webtable

	tr and td tags are present in the tbody tag
	each tr tag represents a table row
	under every tr tag there could be multiple td tags and each td tag represents the col of that row

	Managing of xpaths/cssSelectors while using WebTables
*/
	//table[@class = 'dataTable'] - this represents the entire webtable 
	//table[@class = 'dataTable']/thead - this represents the header of the webtable 
	//table[@class = 'dataTable']/tbody - this represents the complete rows and cols of the webtable

	//table[@class = 'dataTable']/tbody/tr - this represents all the rows of the webtable
	//table[@class = 'dataTable']/tbody/tr[1] - this represents the first row of the webtable 

	//table[@class = 'dataTable']/tbody/tr/td - this represents all the cols in all the rows of the webtable

	//find me 4th row 4th col ??
	//table[@class = 'dataTable']/tbody/tr[4]/td[4] - this represents 4th col of the 4th row

	//find me all the cols of 5th row ??
	//table[@class = 'dataTable']/tbody/tr[5]/td - this represents all cols of 5th row

	//find me entire 4th col ?
	//table[@class = 'dataTable']/tbody/tr/td[4] - this represents entire 4th col of the webtable

	//print me all the Company names in the webtable 
	//table[@class = 'dataTable']/tbody/tr/td[1]

}
