class LocomotiveEngineer
  def self.generate_list_of_wagons(*wagons_id)
    wagons = *wagons_id
    wagons
  end

  def self.fix_list_of_wagons(each_wagons_id, missing_wagons)
    a, b, *rest = each_wagons_id # split out variable
    each_wagons_id = *rest, a, b # add a and b to end
    
    c, *rest = each_wagons_id # split out variable
    fixed_list = c, *missing_wagons, *rest
    fixed_list
  end

  def self.add_missing_stops(route, **args)
    stops = *args.values
    stops_hash = {stops: stops}

    combine_hashes = {**route, **stops_hash}
    combine_hashes
  end

  def self.extend_route_information(route, more_route_information)
    combined = {**route, **more_route_information}
    combined
  end
end
