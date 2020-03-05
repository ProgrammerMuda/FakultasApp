package pas.raga.fakultasapp.ResponseKarya;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseKaryaTI{

	@SerializedName("result")
	private List<ResultItemKarya> result;

	@SerializedName("value")
	private int value;

	public void setResult(List<ResultItemKarya> result){
		this.result = result;
	}

	public List<ResultItemKarya> getKarya(){
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
			"ResponseKaryaTI{" + 
			"result = '" + result + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}