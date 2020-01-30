calculator = (function () {
    
    var datos;

    return {
        setDatos: function () {
            datos = document.getElementsByName("data").value;
            
        },

        ponerDatos: function (datos2) {
            var dat = JSON.parse(datos2)
            $("#resultados").find("#resultsBody").append(
                "<tr><td>" + dat.mean + "</td><td>" + dat.std + "</td></tr>")
        
            
            // var dataJson = JSON.parse(data);
            
        },

        obtenerDatos: function () {           
            calculator.setDatos();
            calculadora.getResultadosR('/calculator/calcular/',datos, calculator.ponerDatos);
            
        }
    };  
})();
calculadora = (function () {

    
    return {      
        getResultadosR: function (url,datas, callback) {

        

        $.ajax({
            url: url,
            data: datas,
            type: 'POST',
            dataType: 'json',
            contentType: 'application/json',
            
            success: function(data){
                console.log(data)
                callback(data);
            },
            error: function(data){
                console.log("error: "+JSON.stringify(datas));
            },
            
        });
/*
        
        $.get( '/calculator/calcular', function( data ) {
        console.log(data);
        
        callback(data);
        
        });*/
        }
    };

})();