package org.ravi;

import java.util.ArrayList;
import java.util.List;

class UsersListFactory {

    private List<User> list = new ArrayList<>();

    static List<User> getList(){
        UsersListFactory ulf = new UsersListFactory();
        ulf.addUser("ravi","hyderabad",55000);
        ulf.addUser("sailaja reddy","kurnool",15000);
        ulf.addUser("visveshwar","tirupati",8000);
        ulf.addUser("pavan","mahaboobnagar",9000);
        ulf.addUser("sneha","kareemnagar",45000);
        ulf.addUser("yasir","hyderabad",43000);
        ulf.addUser("jaihind","hyderabad",25000);
        ulf.addUser("manikanta","kareemnagar",56000);
        ulf.addUser("anoop","nalgonda",56000);
        ulf.addUser("raghavendra","vizag",15000);
        ulf.addUser("anji","hyderabad",35000);
        ulf.addUser("sahoo","dubai",80000);

        return ulf.list;
    }

    private void addUser(String name, String location, int salary){
        list.add(new User(name, location, salary));
    }

}
