package pas.raga.fakultasapp.Response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ResponseTeknik{

	@SerializedName("result")
	private List<ResultItem> result;

	@SerializedName("value")
	private int value;

	public void setResult(List<ResultItem> result){
		this.result = result;
	}

	public List<ResultItem> getResult(){
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
			"ResponseTeknik{" + 
			"result = '" + result + '\'' + 
			",value = '" + value + '\'' + 
			"}";
		}
}