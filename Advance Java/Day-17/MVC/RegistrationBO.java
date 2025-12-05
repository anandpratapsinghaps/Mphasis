package com.example.mvc;
public class RegistrationBO {
    public boolean registerUser(User user) 
    		throws RegistrationBusinessException, RegistrationException {
        boolean successFlag = true;

        if (user.getAge() < 18 || user.getAge() > 60) {
            throw new RegistrationBusinessException("Invalid Age");
        } else {
            UserDAO userDao = new UserDAO();
            successFlag = userDao.insertUser(user);
        }

        return successFlag;
    }
}
