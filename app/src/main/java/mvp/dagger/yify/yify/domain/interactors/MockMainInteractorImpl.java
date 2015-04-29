package mvp.dagger.yify.yify.domain.interactors;

import com.google.gson.Gson;

import mvp.dagger.yify.yify.domain.presenter.FinishListner;
import mvp.dagger.yify.yify.model.movie_list.MovieListWrapper;

import static mvp.dagger.yify.yify.util.CommonUtil.loadJSONFromAsset;

/**
 * Created by krishan on 9/4/15.
 */
public class MockMainInteractorImpl implements MainInteractor {

//    @Override
//    public void fetchData(int pageNum, FinishListner listner) {
//
//    }

    @Override
    public void fetchData(int pageNum,FinishListner finishListner) {
        String str = loadJSONFromAsset("movielist.json");
        finishListner.onSuccess(new Gson().fromJson(str, MovieListWrapper.class));
    }

    @Override
    public void destroy() {

    }
}
