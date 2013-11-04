package be.fnord.util.logic.defaultLogic;

import java.util.LinkedList;

/**
 * The world set is the world facts. Stored as a set of 'facts' about the world the function getWorld
 * will return a logical conjuntive string of facts about the world. 
 * 
 * 
 * 
 * @author edm92
 *
 */
public class WorldSet {

	private LinkedList<String> formula = new LinkedList<String>();

	public LinkedList<String> getFormula() {
		return formula;
	}

	public void setFormula(LinkedList<String> formula) {
		this.formula = formula;
	}
	
	public void addFormula(String _wff){
		formula.add(_wff);
	}
	
	// Shouldn't really be needed.
	public void removeFormula(String _wff){
		formula.remove(_wff);
	}
	
	public String getWorld(){
		if(!formula.isEmpty()){
			String _result = "";
			for(String e : formula){
				_result = _result + " " + a.e.AND + " " + e; 
			}
			_result = _result.substring((" " + a.e.AND + " ").length(), _result.length());
			return _result;
		}else{
			return a.e.EMPTY_FORMULA;
		}
	}
}
