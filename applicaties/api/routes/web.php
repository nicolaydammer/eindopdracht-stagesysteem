<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It is a breeze. Simply tell Lumen the URIs it should respond to
| and give it the Closure to call when that URI is requested.
|
*/

$router->get('/', function () {
    return "helemaal niks ik ga naar bed doeg :3";
});

$router->get('users/', 'UserController@getAllUsers');

$router->get('user/{user_ID}', 'UserController@getUserByID');

$router->get('users/{group_ID}', 'UserController@getUsersByGroupID');

$router->post('user/create', 'UserController@create');
