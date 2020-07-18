package dev.serathiuk.reduxgwt.example.client;

public class ReduxActionFactory {

	public static RefreshMsgAction createRefreshMsgAction(String msg) {
		RefreshMsgAction msgAction = new RefreshMsgAction();
		msgAction.setType("REFRESH");
		msgAction.setMsg(msg);
		return msgAction;
	}
	
}
