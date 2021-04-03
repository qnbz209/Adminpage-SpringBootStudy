package com.mingu.adminpage.ifs;

import com.mingu.adminpage.model.network.Header;

public interface CrudInterface {

    Header create();

    Header read(Long id);

    Header update();

    Header delete(Long id);
}
