package pas.raga.fakultasapp.ResponseJadwal;

import java.util.List;

public class ResponseJadwal{
	private List<ResultItemJadwal> result;
	private int value;

	public void setResult(List<ResultItemJadwal> result){
		this.result = result;
	}

	public List<ResultItemJadwal> getJadwal(){
		return result;
	}

	public void setValue(int value){
		this.value = value;
	}

	public int getValue(){
		return value;
	}

	@Override
 	public String toString(){
		return 
			"ResponseJadwal{" + 
			"result = '" + result + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}