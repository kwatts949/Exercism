"""Functions used in preparing Guido's gorgeous lasagna.

Learn about Guido, the creator of the Python language: https://en.wikipedia.org/wiki/Guido_van_Rossum
"""

EXPECTED_BAKE_TIME = 40

def preparation_time_in_minutes(layers):
    """
    returns number of layers multiplied by 2
    """
    return layers * 2

def bake_time_remaining(minutes):
    """
    returns bake time less elapsed minutes
    """
    return EXPECTED_BAKE_TIME - minutes

def elapsed_time_in_minutes(number_of_layers, elapsed_bake_time):
    """
    returns prep time + elapsed bake time
    """
    return (preparation_time_in_minutes(number_of_layers)) + elapsed_bake_time
