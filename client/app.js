var myModule = angular.module('MealWizard', []);
myModule.controller('MainCtrl',
		function ($scope){
			$scope.ingredients=[
{name:'Fish'},
{name:'Cheese'},
{name:'Bread'}];

$scope.recipes=[
{name:'Cheesy Fish',ingredients:['Fish','Cheese']},
{name:'Fish Sanger',ingredients:['Fish','Cheese','Bread']},
];


});
