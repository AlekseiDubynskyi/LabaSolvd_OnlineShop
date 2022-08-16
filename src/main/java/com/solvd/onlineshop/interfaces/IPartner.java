package com.solvd.onlineshop.interfaces;

import com.solvd.onlineshop.processes.partnership.Partner;

import java.util.Set;

public interface IPartner {

    Partner addPartner(String name, String contact, String partnerID);

    Partner addPartner(Partner partner);

    Set<Partner> deletePartner(Partner partner);
}
