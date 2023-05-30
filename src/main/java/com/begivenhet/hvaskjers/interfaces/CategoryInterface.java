package com.begivenhet.hvaskjers.interfaces;

import com.begivenhet.hvaskjers.models.Categorys;


import java.util.List;

public interface CategoryInterface {
    Categorys SaveCategory(Categorys categorySave);
    List<Categorys> allCategory();

}
