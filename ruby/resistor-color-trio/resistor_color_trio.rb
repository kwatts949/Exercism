class ResistorColorTrio
  def initialize(colours)
    @colours = colours
  end

  def label
    colours = {"black" => 0, "brown" => 1, 'red'=> 2, "orange"=> 3, 'yellow'=> 4, 'green'=> 5, 'blue'=> 6, 'violet'=> 7, 'grey'=> 8, 'white'=> 9}
    # "Resistor value: 33 ohms"
    arr = []
    arr.push(colours.fetch(@colours[0]))
    arr.push(colours.fetch(@colours[1]))
    zeroes = colours.fetch(@colours[2])
    zeroes.times {
      arr.push(0)
    }
    if 
    p "Resistor value: #{arr.join("")} ohms"
    #(colours.fetch(@colours[2]))
    #`Resistor value: #{arr.join("")} ohms `
  end
end