package jp.co.iseise.edabee.simplememo;

public class Memo {
	private long id;
	private String memo;
	private long updated;
	/**
	 * idを取得する
	 * @return id
	 */
	public long getId() {
		return id;
	}
	/**
	 * idを設定する
	 * @param id
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * memoを取得する
	 * @return memo
	 */
	public String getMemo() {
		return memo;
	}
	/**
	 * memoを設定する
	 * @param memo
	 */
	public void setMemo(String memo) {
		this.memo = memo;
	}
	/**
	 * updatedを取得する
	 * @return updated
	 */
	public long getUpdated() {
		return updated;
	}
	/**
	 * updatedを設定する
	 * @param updated
	 */
	public void setUpdated(long updated) {
		this.updated = updated;
	}
}
