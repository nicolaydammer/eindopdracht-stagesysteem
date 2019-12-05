<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
    public function getAllUsers() {
    	return response()->json(User::all());
    }

    public function getUserByID($user_ID) {
    	return response()->json(User::find($user_ID));
    }

    public function getUsersByGroupID($group_ID) {
    	return response()->json(['user' => $group_ID]);
    }

    public function create(Request $request)
    {
        $user = User::create($request->all());

        return response()->json($user, 201);
    }

    public function update($user_ID, $student_ID, $firstname, $lastname, $email) {
    	return response()->json(['user_ID' => $user_ID, 'student_ID' => $student_ID, 'firstname' => $firstname, 'lastname' => $lastname, 'email' => $email]);
    }

    public function delete($user_ID) {
    	return response()->json(['user' => $user_ID]);
    }

}
