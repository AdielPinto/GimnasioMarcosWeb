document.addEventListener("DOMContentLoaded", function () {

    const botonesEliminar = document.querySelectorAll(".btn-eliminar");

    botonesEliminar.forEach(function (boton) {

        boton.addEventListener("click", function (evento) {

            const confirmar = confirm("¿Deseas eliminar este registro?");

            if (!confirmar) {
                evento.preventDefault();
            }

        });

    });

});