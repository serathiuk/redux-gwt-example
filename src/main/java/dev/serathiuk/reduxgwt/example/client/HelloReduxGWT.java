package dev.serathiuk.reduxgwt.example.client;

import com.google.gwt.core.client.EntryPoint;

import dev.serathiuk.reduxgwt.example.client.redux.Reducer;
import dev.serathiuk.reduxgwt.example.client.redux.Redux;
import dev.serathiuk.reduxgwt.example.client.redux.Store;
import elemental2.dom.DomGlobal;

public class HelloReduxGWT implements EntryPoint {

	public void onModuleLoad() {
		Reducer<AppState> reducer = (AppState state, Object action) -> {
			if(action instanceof RefreshMsgAction) {
				AppState app = ObjectUtil.assignObject(state);
				app.setMsg(((RefreshMsgAction) action).getMsg());
				return app;
			}
			
			return state;
		};
		
		Store<AppState> store = Redux.createStore(reducer, new AppState());
		store.subscribe(() -> DomGlobal.console.log(store.getState().getMsg()));
		store.dispatch(ReduxActionFactory.createRefreshMsgAction("Teste 1"));
		store.dispatch(ReduxActionFactory.createRefreshMsgAction("Teste 2"));
		store.dispatch(ReduxActionFactory.createRefreshMsgAction("Teste 3"));
	}
	
}
