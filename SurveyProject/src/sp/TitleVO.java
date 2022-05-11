package sp;

public class TitleVO {
	private int num;
	private String item;
	private int count;
	TitleVO(){}
	TitleVO(int num ,String item, int count){
		this.num=num;
		this.item=item;
		this.count=count;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "TitleVO [num=" + num + ", item=" + item + ", count=" + count + "]";
	}
}
